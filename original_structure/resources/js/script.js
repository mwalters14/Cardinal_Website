$(document).ready(function() {
    
    
   /* Scroll on buttons */
    $('.js--scroll-to-form').click(function () {
       $('html, body').animate({scrollTop: $('.js--form').offset().top}, 3000); 
    });
    
    $('.js--scroll-to-partners').click(function () {
       $('html, body').animate({scrollTop: $('.js--partners').offset().top-40}, 3000); 
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
            }, 4000);
            return false;
          }
        }
      });
    });
    
    /* Animations on scroll */
    $('.js--wp-1').waypoint(function(direction) {
        $('.js--wp-1').addClass('animated fadeInUp');
    }, {
        offset: '58%'
    })
    
    $('.js--wp-2').waypoint(function(direction) {
        $('.js--wp-2').addClass('animated heartBeat');
    }, {
        offset: '65%'
    })
    
    $('.js--wp-3').waypoint(function(direction) {
        $('.js--wp-3').addClass('animated fadeInLeft');
    }, {
        offset: '65%'
    })
    
        /* Mobile navigation */
    $('.js--nav-icon').click(function() {
        var nav = $('.js--main-nav');
        var icon = $('.js--nav-icon i');
        
        if (icon.hasClass('ion-navicon-round')) {
            icon.addClass('ion-close-round');
            icon.removeClass('ion-navicon-round');
        } else {
            icon.addClass('ion-navicon-round');
            icon.removeClass('ion-close-round');
        }
        nav.slideToggle(200);
    });
});


function get_name() {
    var input_name = document.getElementById("name");
    alert(input_name);
}

function get_email() {
    var input_email = document.getElementById("email");
    alert(input_email);
}

function get_find_us() {
    var input_find_us = document.getElementById("find_us");
    alert(input_find_us);
}

function get_news() {
    var input_news = document.getElementById("news");
    alert(input_news);
}

function get_message() {
    var input_message = document.getElementById("message");
    alert(input_message);
}

function form_controller() {
    get_name;
    get_email;
    get_find_us;
    get_news;
    get_message
}

$(".arrow").on("click",function() {
     $('html, body').animate({
        scrollTop: $("#authentication").offset().top-68
    }, 2000);
});