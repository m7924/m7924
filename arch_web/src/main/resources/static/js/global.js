
window.setTimeout(function(){
$(".loading").fadeOut(500)
},400)

$(document).ready(function(){
	$(window).load(function () {
          $(".mobile-inner-header-icon").click(function(){
            $(this).toggleClass("mobile-inner-header-icon-click mobile-inner-header-icon-out");
            $(".mobile-inner-nav").slideToggle(250);
          });
          $(".mobile-inner-nav li").each(function( index ) {
            $( this ).css({'animation-delay': (index/10)+'s'});
          });
          $(".mobile-inner-nav li").click(function(){
            $(this).find('dl').slideToggle(200)
          })
        });

})

$(document).ready(function(){

$(".login .topText .text1,.login .topText .text2 img").each(function( index ) {
            $( this ).css({'animation-delay': (index/10)+'s'});
          });




$('.login .topText .text1,.login .topText .text2').addClass('wow fadeInUp')






var wow = new WOW({
    boxClass: 'wow',
    animateClass: 'animated',
    offset: 0,
    mobile: true,
    live: true
});
wow.init();



$('.leftMenu .item').click(function(){
  $('.leftMenu .item').removeClass('current')
  $(this).addClass('current')
  $('.leftMenu .item dl').not($(this).find('dl')).slideUp(200)
  $(this).find('dl').slideToggle(200)
})




$('.videoList .slide a').click(function(){
 var flex = $(this).attr('data-flex')
$('.videoList .slide a').removeClass('current')
 $(this).addClass('current')
  $(' .videoList ul').attr('class', ' type' + flex )
})


$('.lock').click(function(){
  $(this).toggleClass('locked')
})


$('.videoInforControls .pointList .h4tit').click(function(){
  $(this).toggleClass('current')
  $(this).next('dl').stop()
  $(this).next('dl').slideToggle(200)
})




$('.topMenu .switch').click(function(){
  $('.topMenu .link').toggleClass('current')
})

$('.leftSwitch').click(function(){
  $('.leftSwitch,.leftMenu,.rightContent').toggleClass('current')
})


$('.controlsBtn li .h2tit  i.wap').click(function(){
  $('#model1').fadeIn(200)
})
$('#model1 ').click(function(){
  $('#model1').fadeOut(200)
})


function time(){
  var myDate = new Date;
      var year = myDate.getFullYear(); //获取当前年
      var mon = myDate.getMonth() + 1; //获取当前月
      var date = myDate.getDate(); //获取当前日
      var h = myDate.getHours();//获取当前小时数(0-23)
      var m = myDate.getMinutes();//获取当前分钟数(0-59)
      var s = myDate.getSeconds();//获取当前秒
      var week = myDate.getDay();
      var weeks = ["星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"];
      

      if (h<10) {
        h="0"+h
      }
      if (s<10) {
        s='0'+s
      }
      $(".day").html(year + " 年 " + mon + " 月 " + date + " 日 "  + '<span>'+ h+ ":" + m+ ":"  + s +" </span>" + weeks[week]);

}

time()

    setInterval(function(){
      
time()
    },1000)

getLunar()

function getLunar(){

  var nyear;
  var nmonth;
  var nday = -1;
  var nwday;
  var nhrs;
  var nmin;
  var nsec;

  var lmonth, lday, lleap; //农历参数
  
  function Draw() {
      NewTick();

      //显示时间
      var s = nyear + '年' + nmonth + '月' + nday + '日 ' + '星期' + cweekday(nwday) + ' ' + shapetime(nhrs, nmin, nsec);
      s += " 农历" + lmonth + "月" + lday; //农历
      var lunar_month_day=lmonth + "月" + lday;
      //需要展示在页面地方
      $(".nl").text(lunar_month_day);
  }
  
  
  function NewTick() {
      noww = new Date();
      if (noww.getDate() != nday) {
          nyear = noww.getFullYear();
          nmonth = noww.getMonth() + 1;
          nwday = noww.getDay();
          nday = noww.getDate();

          getlunar(); //获取农历
      }
      nhrs = noww.getHours();
      nmin = noww.getMinutes();
      nsec = noww.getSeconds();
  }


  //辅助函数
  var hzWeek = new Array("日", "一", "二", "三", "四", "五", "六", "日");
  function cweekday(wday) {
      return hzWeek[wday];
  }
  function shapetime(vhrs, vmin, vsec) {
      if (vsec <= 9) vsec = "0" + vsec;
      if (vmin <= 9) vmin = "0" + vmin;
      if (vhrs <= 9) vhrs = "0" + vhrs;
      return vhrs + ":" + vmin + ":" + vsec
  }

  //农历函数开始
  var lunarInfo = new Array(0x04bd8, 0x04ae0, 0x0a570, 0x054d5, 0x0d260, 0x0d950, 0x16554, 0x056a0, 0x09ad0, 0x055d2, 0x04ae0, 0x0a5b6, 0x0a4d0, 0x0d250, 0x1d255, 0x0b540, 0x0d6a0, 0x0ada2, 0x095b0, 0x14977, 0x04970, 0x0a4b0, 0x0b4b5, 0x06a50, 0x06d40, 0x1ab54, 0x02b60, 0x09570, 0x052f2, 0x04970, 0x06566, 0x0d4a0, 0x0ea50, 0x06e95, 0x05ad0, 0x02b60, 0x186e3, 0x092e0, 0x1c8d7, 0x0c950, 0x0d4a0, 0x1d8a6, 0x0b550, 0x056a0, 0x1a5b4, 0x025d0, 0x092d0, 0x0d2b2, 0x0a950, 0x0b557, 0x06ca0, 0x0b550, 0x15355, 0x04da0, 0x0a5b0, 0x14573, 0x052b0, 0x0a9a8, 0x0e950, 0x06aa0, 0x0aea6, 0x0ab50, 0x04b60, 0x0aae4, 0x0a570, 0x05260, 0x0f263, 0x0d950, 0x05b57, 0x056a0, 0x096d0, 0x04dd5, 0x04ad0, 0x0a4d0, 0x0d4d4, 0x0d250, 0x0d558, 0x0b540, 0x0b6a0, 0x195a6, 0x095b0, 0x049b0, 0x0a974, 0x0a4b0, 0x0b27a, 0x06a50, 0x06d40, 0x0af46, 0x0ab60, 0x09570, 0x04af5, 0x04970, 0x064b0, 0x074a3, 0x0ea50, 0x06b58, 0x05ac0, 0x0ab60, 0x096d5, 0x092e0, //1990
  0x0c960, 0x0d954, 0x0d4a0, 0x0da50, 0x07552, 0x056a0, 0x0abb7, 0x025d0, 0x092d0, 0x0cab5, 0x0a950, 0x0b4a0, 0x0baa4, 0x0ad50, 0x055d9, 0x04ba0, 0x0a5b0, 0x15176, 0x052b0, 0x0a930, 0x07954, 0x06aa0, 0x0ad50, 0x05b52, 0x04b60, 0x0a6e6, 0x0a4e0, 0x0d260, 0x0ea65, 0x0d530, 0x05aa0, 0x076a3, 0x096d0, 0x04bd7, 0x04ad0, 0x0a4d0, 0x1d0b6, 0x0d250, 0x0d520, 0x0dd45, 0x0b5a0, 0x056d0, 0x055b2, 0x049b0, 0x0a577, 0x0a4b0, 0x0aa50, 0x1b255, 0x06d20, 0x0ada0, 0x14b63);
  function lYearDays(y) {
      var i, sum = 348;
      for (i = 0x8000; i > 0x8; i >>= 1) sum += (lunarInfo[y - 1900] & i) ? 1 : 0;
      return (sum + leapDays(y));
  }
  function leapDays(y) {
      if (leapMonth(y)) return ((lunarInfo[y - 1900] & 0x10000) ? 30 : 29);
      else return (0);
  }
  function leapMonth(y) {
      return (lunarInfo[y - 1900] & 0xf);
  }
  function monthDays(y, m) {
      return ((lunarInfo[y - 1900] & (0x10000 >> m)) ? 30 : 29);
  }
  function Lunar(y, m, d) {
      var i, leap = 0,
      temp = 0;
      var offset = (Date.UTC(y, m, d) - Date.UTC(1900, 0, 31)) / 86400000;
      for (i = 1900; i < 2050 && offset > 0; i++) {
          temp = lYearDays(i);
          offset -= temp;
      }
      if (offset < 0) {
          offset += temp;
          i--;
      }
      this.year = i;
      leap = leapMonth(i);
      this.isLeap = false;
      for (i = 1; i < 13 && offset > 0; i++) {
          if (leap > 0 && i == (leap + 1) && this.isLeap == false) {--i;
              this.isLeap = true;
              temp = leapDays(this.year);
          } else {
              temp = monthDays(this.year, i);
          }
          if (this.isLeap == true && i == (leap + 1)) this.isLeap = false;
          offset -= temp;
      }
      if (offset == 0 && leap > 0 && i == leap + 1) if (this.isLeap) {
          this.isLeap = false;
      } else {
          this.isLeap = true; --i;
      }
      if (offset < 0) {
          offset += temp; --i;
      }
      this.month = i;
      this.day = offset + 1;
  }
  var nStr1 = new Array('', '一', '二', '三', '四', '五', '六', '七', '八', '九', '十', '十一', '十二');
  var nStr2 = new Array('初', '十', '廿', '卅', '□');
  function GetcDay(d) {
      var s;
      switch (d) {
      case 10:
          s = '初十';
          break;
      case 20:
          s = '二十';
          break;
      case 30:
          s = '三十';
          break;
      default:
          s = nStr2[Math.floor(d / 10)];
          s += nStr1[d % 10];
          break;
      }
      return (s);
  }
  function GetcMon(m) {
      if (m == 1) return '正';
      else return nStr1[m];
  }
  function getlunar() {
      var lObj = new Lunar(nyear, nmonth - 1, nday);
      lmonth = GetcMon(lObj.month);
      lday = GetcDay(lObj.day);
      lleap = lObj.isLeap;
      if (lleap == 1) {
          lmonth = "闰" + lmonth;
      }
  }
  //农历函数结束
  Draw();
}



// $(' .tableScrollContent td .item').click(function(){

//   if($(this).find('input').is(':checked')){ 
//     alert(1)
//     $(this).parents('tr').addClass('current')
//   }
//   else{
//     $(this).parents('tr').removeClass('current')
//   }
// })

$('.chooseContent2 .add').click(function(){
  $('#addAlert').fadeIn(200)
})
$('.alertModel2 .titlemd .close').click(function(){
  $(this).parents('.alertModel2').fadeOut(200)
})


$('.selectMadel dl dd a').click(function(){
  $(this).parents('.selectMadel').find('.h2tit').text($(this).text())
})






$('.leftMenu .item:nth-child(3) h2.h2tit a').attr('href','班级组信息.htm')
$('.leftMenu .item:nth-child(2) h2.h2tit a').attr('href','1-视频监控-1-省厅远程监控.htm')


$('.leftMenu .item:nth-child(1) dl dd:nth-child(2) a').attr('href','###')
$('.leftMenu .item:nth-child(1) dl dd:nth-child(1) a').attr('href','项目情况.htm')

$('.leftMenu .item:nth-child(2) dl dd:nth-child(1) a').attr('href','1-视频监控-1-省厅远程监控.htm')
$('.leftMenu .item:nth-child(2) dl dd:nth-child(2) a').attr('href','1-视频监控-2-项目监控.htm')
$('.leftMenu .item:nth-child(2) dl dd:nth-child(3) a').attr('href','1-视频监控-3-AI监控.htm')
$('.leftMenu .item:nth-child(2) dl dd:nth-child(4) a').attr('href','1-视频监控-4-录像回放.htm')

$('.leftMenu .item:nth-child(3) dl dd:nth-child(1) a').attr('href','2-劳务实名制-1-班组信息(1).htm')
$('.leftMenu .item:nth-child(3) dl dd:nth-child(2) a').attr('href','2-劳务实名制-2-人员管理(1).htm')
$('.leftMenu .item:nth-child(3) dl dd:nth-child(3) a').attr('href','2-劳务实名制-3-参建单位(1).htm')
$('.leftMenu .item:nth-child(3) dl dd:nth-child(4) a').attr('href','2-劳务实名制-4-疫情防控(1).htm')
$('.leftMenu .item:nth-child(3) dl dd:nth-child(5) a').attr('href','2-劳务实名制-5-工资管理(1).htm')
$('.leftMenu .item:nth-child(3) dl dd:nth-child(6) a').attr('href','2-劳务实名制-6-报表统计(2).htm')

$('.topMenu .link a.icon3').attr('href','login.htm')

$('.login .mainContent .send').click(function(){
  window.location.href='全新看板.htm';
  return false; 
})


if ($('.controlsBtn li').length == 6) {
 $('.controlsBtn li:nth-child(1) .h2tit a').attr('href','全新看板.htm')
 $('.controlsBtn li:nth-child(2) .h2tit a').attr('href','2-劳务实名制-7-安全教育(1).htm')
 $('.controlsBtn li:nth-child(3) .h2tit a').attr('href','2-劳务实名制-9-更多配置(考勤调整).htm')
 $('.controlsBtn li:nth-child(3) dl a').attr('href','2-劳务实名制-6-补打卡管理.htm')
 $('.controlsBtn li:nth-child(4) .h2tit a').attr('href','2-劳务实名制-10-暂退场管理.htm')
 $('.controlsBtn li:nth-child(5) .h2tit a').attr('href','2-劳务实名制-8-黑名单管理(新增).htm')
 $('.controlsBtn li:nth-child(6) .h2tit a').attr('href','1-视频监控-8-上传监管系统.htm')
}
if ($('.controlsBtn li').length == 5) {
 $('.controlsBtn li:nth-child(1) .h2tit a').attr('href','全新看板.htm')
 $('.controlsBtn li:nth-child(2) .h2tit a').attr('href','1-视频监控-5-添加视频.htm')
 $('.controlsBtn li:nth-child(2) dl dd:nth-child(1) a').attr('href','###.htm')
 $('.controlsBtn li:nth-child(2) dl dd:nth-child(2) a').attr('href','1-视频监控-5-添加视频2.htm')
 $('.controlsBtn li:nth-child(3) .h2tit a').attr('href','1-视频监控-6-视频管理.htm')
 $('.controlsBtn li:nth-child(4) .h2tit a').attr('href','1-视频监控-7-监控点运维.htm')
 $('.controlsBtn li:nth-child(5) .h2tit a').attr('href','1-视频监控-8-上传监管系统.htm')
}












});