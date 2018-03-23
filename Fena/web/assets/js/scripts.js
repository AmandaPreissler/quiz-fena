//jQuery(function () {
//    jQuery('#resposta').bind('click', checkRadio);
//})
//
//function checkRadio() {
//    var isChecked = jQuery("input[name=options]:checked").val();
//    console.log(isChecked);
//    var booleanVlaueIsChecked = false;
//    if (!isChecked) {
//        booleanVlaueIsChecked = true;
//        alert('HELP');
//        return false;
//    }
//}

$("#ticket-to-ride").on("click", function (e) {
    e.preventDefault();
    alert("henlo");
//    $("#box").addClass($(this).data(""));
});

$("#alo").on("click", function (e) {
    e.preventDefault();
    alert("henlo");
//    $("#box").addClass($(this).data(""));
});

var dv = document.getElementById("ticket-to-ride");
dv.onclick = function(event) {
    var d = document.getElementById("box");
    if(d != null) {
        d.style.display = "none";
    }
};