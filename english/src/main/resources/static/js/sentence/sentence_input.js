const sentenceInput = {
    saveSentence: function () {
        const data = {
            englishSentence: $('#english-sentence').val(),
            koreanSentence: $('#korean-sentence').val(),
        };

        $.ajax({
            type: 'POST',
            url: '/sentence/api/v1',
            dataType: 'json',
            contentType: 'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function () {
            // FIXME : 성공해도 팝업이 안뜸.
            alert('등록되었습니다.');

        }).fail(function (error) {
            console.log(error);
        });
    },

    // update : function (){
    //     var data = {
    //         title: $('#title').val(),
    //         content: $('#content').val()
    //     };
    //
    //     var id = $('#id').val();
    //
    //     $.ajax({
    //         type: 'PUT',
    //         url: '/api/v1/posts/'+id,
    //         dataType: 'json',
    //         contentType : 'application/json; charset=utf-8',
    //         data : JSON.stringify(data)
    //     }).done(function (){
    //         alert('글이 수정되었습니다.');
    //         window.location.href = '/';
    //     }).fail(function(error) {
    //         alert(JSON.stringify(error))
    //     });
    // },
    //
    // delete : function(){
    //     var id = $('#id').val();
    //     $.ajax({
    //         type: 'DELETE',
    //         url: '/api/v1/posts/'+id,
    //         dataType: 'json',
    //         contentType : 'application/json; charset=utf-8'
    //     }).done(function (){
    //         alert('글이 삭제되었습니다.');
    //         window.location.href = '/';
    //     }).fail(function(error) {
    //         alert(JSON.stringify(error))
    //     });
    // }

};

$(document).ready(function(){
    $( "#save-sentence" ).bind( "click", function() {
        sentenceInput.saveSentence();
    });
});