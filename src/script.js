function myFunction() {
  var x = document.getElementById("navBar2");
  if (x.className === "topnav") {
    x.className += " responsive";
  } else {
    x.className = "topnav";
  }
}