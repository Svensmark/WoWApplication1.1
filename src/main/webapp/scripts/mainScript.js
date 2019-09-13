getFetchData("get/role/Tank");

function getFetchData(path) {
    fetch("/WoWApplication/api/accounts/" + path)
            .then(res => res.json())
            .then(data => {
                console.log("data",data);
                roleToArray(data);
            });
}

    
function membersToList() {
    var htmlString = '<ul class="list-group">' + 
            '<li class="list-group-item"><h1>Tanks</h1></li>' +
            roleToArray("Tank") + '</ul>' +
            '<li class="list-group-item"><h1>Healers</h1></li>' +
            roleToArray("Healer") + '</ul>' +
            '<li class="list-group-item"><h1>Tanks</h1></li>' +
            roleToArray("DPS") + '</ul>' +
            '<li class="list-group-item"><h1>Tanks</h1></li>' +
            roleToArray("Reserve") + '</ul>';
    
}

function roleToArray(role) {
    var data = getFetchData("get/role/"+role);
    var array = convertToArray(data);
    for (var a of array) {
        console.log(a.username);
    }
}

function roleToArray(array) {
    for (var a of array) {
        console.log(a.username);
    }
}

function convertToArray(array){
    try {
        if(array[0] === undefined)
        {
            throw "undefined";
        }
        return array;
    } catch (e)
    {
        return [array];
    }
}