$(function() {
    $('#messages li').click(function() {
        $(this).fadeOut();
    });
    setTimeout(function() {
        $('#messages li').fadeOut();
    }, 3000);
});