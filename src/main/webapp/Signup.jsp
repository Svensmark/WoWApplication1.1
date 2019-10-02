
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Signup Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
                integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
                integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
                integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
        <link rel="stylesheet" type="text/css" href="main.css">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    </head>
    <body>
        <link href='https://fonts.googleapis.com/css?family=Open+Sans+Condensed:300' rel='stylesheet' type='text/css'>
        <div class="container-fluid">
            <form action="/WoWApplication/ProcessRequest" method="POST" class="register-form"> 
                <div class="row">      
                    <div class="col-md-4 col-sm-4 col-lg-4">
                        <label for="ignName">CHARACTER NAME</label>
                        <input name="ignName" class="form-control" type="text">    
                    </div>            
                </div>
                <div class="row">
                    <div class="col-md-4 col-sm-4 col-lg-4">
                        <label for="charClass">CLASS</label>
                        <select name="charClass" class="form-control input-sm" id="charClass">
                            <option value="Mage">Mage</option>
                            <option value="Priest">Priest</option>
                            <option value="Paladin">Paladin</option>
                            <option value="Rogue">Rogue</option>
                            <option value="Warrior">Warrior</option>
                            <option value="Warlock">Warlock</option>
                            <option value="Druid">Druid</option>
                        </select>
                        <span class="help-block"> </span>    
                    </div>            
                </div>
                <div class="row">
                    <div class="col-md-4 col-sm-4 col-lg-4">
                        <label for="role">ROLE</label>
                        <select name="role" class="form-control input-sm" id="role">
                            <option value="DPS">DPS</option>
                            <option value="Tank">Tank</option>
                            <option value="Healer">Healer</option>
                        </select>
                        <span class="help-block"> </span>          
                    </div>            
                </div>
                <div class="row">      
                    <div class="col-md-4 col-sm-4 col-lg-4">
                        <label for="primaryProf">PRIMARY PROFESSION</label>
                        <select name="primaryProf" class="form-control input-sm" id="primaryProf">
                            <option value="Alchemy">Alchemy</option>
                            <option value="Blacksmithing">Blacksmithing</option>
                            <option value="Enchanting">Enchanting</option>
                            <option value="Engineering">Engineering</option>
                            <option value="Leatherworking">Leatherworking</option>
                            <option value="Tailoring">Tailoring</option>
                            <option value="Herbalism">Herbalism</option>
                            <option value="Mining">Mining</option>
                            <option value="Skinning">Skinning</option>
                        </select>
                        <span class="help-block"> </span>     
                    </div>            
                </div>
                <div class="row">      
                    <div class="col-md-4 col-sm-4 col-lg-4">
                        <label for="secondaryProf">SECONDARY PROFESSION</label>
                        <select name="secondaryProf" class="form-control input-sm" id="secondaryProf">
                            <option value="Alchemy">Alchemy</option>
                            <option value="Blacksmithing">Blacksmithing</option>
                            <option value="Enchanting">Enchanting</option>
                            <option value="Engineering">Engineering</option>
                            <option value="Leatherworking">Leatherworking</option>
                            <option value="Tailoring">Tailoring</option>
                            <option value="Herbalism">Herbalism</option>
                            <option value="Mining">Mining</option>
                            <option value="Skinning">Skinning</option>
                        </select>
                        <span class="help-block"> </span>     
                    </div>            
                </div>
                <hr>
                <div class="row">
                    <div class="col-md-6 col-sm-6 col-xs-6 col-lg-6">
                        <button class="btn btn-default regbutton">Register</button>
                    </div>       
                </div>    
            </form>
        </div>
    </body>
</html>
