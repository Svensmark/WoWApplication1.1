
document.addEventListener('DOMContentLoaded', () => {
  generateLegend();
});

function generateLegend() {
    getTankList();
    getHealerList();
    getDPSList();
    getAlchemyList();
    getBlacksmithingList();
    getEnchantingList();
    getEngineeringList();
    getLeatherworkList();
    getTailoringList();
    getHerbalismList();
    getMiningList();
    getSkinningList();
    getCookingList();
}




function getTankList() {
    fetch("/WoWApplication/api/account/get/role/Tank")
            .then(res => res.json())
            .then(data => {
                document.getElementById("membersList").innerHTML += tankList(data);
            });
}
function getHealerList() {
    fetch("/WoWApplication/api/account/get/role/Healer")
            .then(res => res.json())
            .then(data => {
                document.getElementById("membersList").innerHTML += healerList(data);
            });
}
function getDPSList() {
    fetch("/WoWApplication/api/account/get/role/dps")
            .then(res => res.json())
            .then(data => {
                document.getElementById("membersList").innerHTML += dpsList(data);
            });
}
function getAlchemyList() {
    fetch("/WoWApplication/api/account/get/prof/alchemy")
            .then(res => res.json())
            .then(data => {
                document.getElementById("alchemyExpert").innerHTML += profList(data,"Alchemy");
            });
}
function getBlacksmithingList() {
    fetch("/WoWApplication/api/account/get/prof/blacksmithing")
            .then(res => res.json())
            .then(data => {
                document.getElementById("blacksmithingExpert").innerHTML += profList(data,"Blacksmithing");
            });
}
function getEnchantingList() {
    fetch("/WoWApplication/api/account/get/prof/enchanting")
            .then(res => res.json())
            .then(data => {
                document.getElementById("enchantingExpert").innerHTML += profList(data,"Enchanting");
            });
}
function getEngineeringList() {
    fetch("/WoWApplication/api/account/get/prof/engineering")
            .then(res => res.json())
            .then(data => {
                document.getElementById("engineeringExpert").innerHTML += profList(data,"Engineering");
            });
}
function getLeatherworkList() {
    fetch("/WoWApplication/api/account/get/prof/leatherwork")
            .then(res => res.json())
            .then(data => {
                document.getElementById("leatherworkExpert").innerHTML += profList(data,"Leatherwork");
            });
}
function getTailoringList() {
    fetch("/WoWApplication/api/account/get/prof/tailoring")
            .then(res => res.json())
            .then(data => {
                document.getElementById("tailoringExpert").innerHTML += profList(data,"Tailoring");
            });
}
function getHerbalismList() {
    fetch("/WoWApplication/api/account/get/prof/herbalism")
            .then(res => res.json())
            .then(data => {
                document.getElementById("herbalismExpert").innerHTML += profList(data,"Herbalism");
            });
}
function getMiningList() {
    fetch("/WoWApplication/api/account/get/prof/mining")
            .then(res => res.json())
            .then(data => {
                document.getElementById("miningExpert").innerHTML += profList(data,"Mining");
            });
}
function getSkinningList() {
    fetch("/WoWApplication/api/account/get/prof/skinning")
            .then(res => res.json())
            .then(data => {
                document.getElementById("skinningExpert").innerHTML += profList(data,"Skinning");
            });
}
function getCookingList() {
    fetch("/WoWApplication/api/account/get/prof/cooking")
            .then(res => res.json())
            .then(data => {
                document.getElementById("cookingExpert").innerHTML += profList(data,"Cooking");
            });
}



function tankList(data) {
    var htmlString = "<ul class=\"list-group container-fluid\"> <li class=\"list-group-item\"><h1>Tanks</h1></li>";
    for (var a of data) {
        htmlString += "<li class=\"list-group-item list-group-item-secondary\">" + a.account_username + "</br>" + a.account_charClass +  "</li> ";
    }
    htmlString += "</ul>";
    return htmlString;
}
function healerList(data) {
    var htmlString = "<ul class=\"list-group container-fluid\"> <li class=\"list-group-item\"><h1>Healers</h1></li>";
    for (var a of data) {
        htmlString += "<li class=\"list-group-item list-group-item-success\">" + a.account_username + "</br>" + a.account_charClass + "</li> ";
    }
    htmlString += "</ul>";
    return htmlString;
}
function dpsList(data) {
    var htmlString = "<ul class=\"list-group container-fluid\"> <li class=\"list-group-item\"><h1>DPS</h1></li>";
    for (var a of data) {
        htmlString += "<li class=\"list-group-item list-group-item-danger\">" + a.account_username + "</br>" + a.account_charClass + "</li> ";
    }
    htmlString += "</ul>";
    return htmlString;
}
function profList(data,prof) {
    var htmlString = "<h5 class=\"card-title\">" + prof +"</h5>";
    for (var a of data) {
        htmlString += "<p class=\"card-text\">" + a.account_username + "</p>";
    }
    return htmlString;
}



