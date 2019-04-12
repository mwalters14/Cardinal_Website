$(document).ready(function() {
    
    
   /* Scroll on buttons */
    $('.js--scroll-to-form').click(function () {
       $('html, body').animate({scrollTop: $('.js--form').offset().top}, 1000); 
    });
    
    $('.js--scroll-to-partners').click(function () {
       $('html, body').animate({scrollTop: $('.js--partners').offset().top-40}, 1000); 
    });
    
    
    /* Navigation scroll */
    $(function() {
      $('a[href*=#]:not([href=#])').click(function() {
        if (location.pathname.replace(/^\//,'') == this.pathname.replace(/^\//,'') && location.hostname == this.hostname) {
          var target = $(this.hash);
          target = target.length ? target : $('[name=' + this.hash.slice(1) +']');
          if (target.length) {
            $('html,body').animate({
              scrollTop: target.offset().top-70
            }, 1000);
            return false;
          }
        }
      });
    });
    
    
});