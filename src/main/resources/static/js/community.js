function post() {
    var questionId = $("#question_id").val();
    var content = $("#comment_content").val();

    comment2target(questionId, 1, content);
}

function comment2target(targetId, type, content) {
    if (!content) {
        alert("不能回复空内容");
        return;
    }

    $.ajax({
        type: "POST",
        url: "/comment",
        contentType: 'application/json',
        data: JSON.stringify({
            "parentId": targetId,
            "content": content,
            "type": type
        }),
        success: function (response) {
            if (response.code == 200) {
                // $("#comment_section").hide();
                window.location.reload();
            } else {
                if (response.code == 2003) {
                    var isAccepted = confirm(response.message);
                    if (isAccepted) {
                        window.open("https://github.com/login/oauth/authorize?client_id=d4ef7d0fcce9196ba5e9&redirect_uri=http://localhost:8887/callback&scope=user&state=1")
                        window.localStorage.setItem("closable", true);

                    }
                }
                alert(response.message);
            }
            console.log(response);
        },
        dataType: "json"
    });


}

function comment(e) {
    var commentId = e.getAttribute("data-id");
    var content = $("#input-"+commentId).val();
    comment2target(commentId, 2, content);
}

/**
 * 展开二级评论
 */

function collapseComments(e) {
    var id = e.getAttribute("data-id");
    var comment = $("#comment-" + id);
    // 获取二级评论的展开状态
    var collapse = e.getAttribute("data-collapse");
    if (collapse) {
        //折叠二级评论
        comment.removeClass("in");
        e.removeAttribute("data-collapse");
        e.classList.remove("active");
    } else {
        $.getJSON( "/comment/" + id, function( data ) {
            var commentBody = $("comment-body-" + id);
            comments.appendChild();
            $.each( data.data, function( key, val ) {
                items.push( "<li id='" + key + "'>" + val + "</li>" );
            });

            $( "<ul/>", {
                "class": "my-new-list",
                html: items.join( "" )
            }).appendTo( "body" );
            //展开二级评论
            comment.addClass("in");
            //标记二级评论状态
            e.setAttribute("data-collapse", "in");
            e.classList.add("active");
        });
    }

}