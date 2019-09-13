
document.addEventListener('DOMContentLoaded', () => {
  generateLegend();
});

function generateLegend() {
    getTankList();
    getHealerList();
    getDPSList();
}




function getTankList() {
    fetch("/WoWApplication/api/account/get/role/Tank")
            .then(res => res.json())
            .then(data => {
                console.log("data",data);
                console.log("test",tankList(data));
                document.getElementById("membersList").innerHTML += tankList(data);
            });
}

function getHealerList() {
    fetch("/WoWApplication/api/account/get/role/Healer")
            .then(res => res.json())
            .then(data => {
                console.log("data",data);
                console.log("test",tankList(data));
                document.getElementById("membersList").innerHTML += healerList(data);
            });
}

function getDPSList() {
    fetch("/WoWApplication/api/account/get/role/dps")
            .then(res => res.json())
            .then(data => {
                console.log("data",data);
                console.log("test",tankList(data));
                document.getElementById("membersList").innerHTML += dpsList(data);
            });
}



function tankList(data) {
    var htmlString = "<ul class=\"list-group\"> <li class=\"list-group-item\"><h1>Tanks</h1></li>";
    var data = data;
    for (var a of data) {
        htmlString += "<li class=\"list-group-item list-group-item-secondary\">" + a.username + " - " + a.charClass + "</li> ";
    }
    htmlString += "</ul>";
    return htmlString;
}

function healerList(data) {
    var htmlString = "<ul class=\"list-group\"> <li class=\"list-group-item\"><h1>Healers</h1></li>";
    var data = data;
    for (var a of data) {
        htmlString += "<li class=\"list-group-item list-group-item-success\">" + a.username + " - " + a.charClass + "</li> ";
    }
    htmlString += "</ul>";
    return htmlString;
}

function dpsList(data) {
    var htmlString = "<ul class=\"list-group\"> <li class=\"list-group-item\"><h1>DPS</h1></li>";
    var data = data;
    for (var a of data) {
        htmlString += "<li class=\"list-group-item list-group-item-danger\">" + a.username + " - " + a.charClass + "</li> ";
    }
    htmlString += "</ul>";
    return htmlString;
}

