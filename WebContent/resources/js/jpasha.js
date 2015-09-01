$(document).ready(function() {
alert('jpasha');
$('#comments-container').comments({
    profilePictureURL: 'https://app.viima.com/static/media/user_profiles/user-icon.png',
  
    getComments: function(success, error) {
    	 $.ajax({
             type: 'get',
             url: '/willcode4coff/getcomments',
             success: function(commentsArray) {
              var comments = commentsArray;
            	 success(comments);
             },
             error: error
         });
       
    }


		

	

    
});



$('#comments-container').comments({
    postComment: function(commentJSON, success, error) {
        $.ajax({
            type: 'post',
            url: '/api/comments/',
            data: commentJSON,
            success: function(comment) {
                success(comment)
            },
            error: error
        });
    }
});
	
});