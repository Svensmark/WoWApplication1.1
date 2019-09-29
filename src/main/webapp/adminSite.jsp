

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
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
        
        <title>Admin Site</title>
    </head>
    <body>    
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
            <a class="navbar-brand" href="#">Sleepless Nights</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                    aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="#home">Home <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" href="#news">News <span class="sr-only"></span></a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" href="#events">Events<span class="sr-only"></span></a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" href="#members">Members<span class="sr-only"></span></a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" href="#professions">Professions<span class="sr-only"></span></a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" href="loginandsignup.jsp">Login | Signup<span class="sr-only"></span></a>
                    </li>
                </ul>
            </div>
        </nav>    
        
         <main role="main">
            <div class="jumbotron">
                <div class="container">
                    <h1 class="display-3 sectionheadline">Sheepless Nights</h1>
                </div>
            </div>

            <div class="content" id="home">
                <div class="container">
                    <h1 class="sectionheadline"> Home Settings </h1>
                    <div class="row">

                    </div>
                </div>
            </div>

            <div class="content" id="news">
                <div class="container">
                    <h1 class="sectionheadline"> News Settings </h1>
                    <div class="row">
                        
                    </div>
                </div>
            </div>

            <div class="content" id="events">
                <div class="container">
                    <h1 class="sectionheadline"> Events Settings </h1>
                    <div class="row">

                        
                        
                    </div>
                </div>
            </div>

            <div class="content" id="members">
                <div class="container">
                    <h1 class="sectionheadline"> Members </h1>
                    <div class="row container-fluid" id="membersList">
                    </div>
                </div>
            </div>

            <div class="content" id="professions">
                <div class="container">
                    <h1 class="sectionheadline"> Profession Experts </h1>
                    <div class="row">
                        <div class="card container-fluid" style="width: 13rem;">
                            <img src="images/AlchemyLogo.JPG" class="card-img-top" alt="alchemylogo">
                            <div class="card-body" id="alchemyExpert">
                            </div>
                        </div>
                        <div class="card container-fluid" style="width: 13rem;">
                            <img src="images/BlacksmithingLogo.JPG" class="card-img-top" alt="...">
                            <div class="card-body" id="blacksmithingExpert">
                            </div>
                        </div>
                        <div class="card container-fluid" style="width: 13rem;">
                            <img src="images/EnchantingLogo.JPG" class="card-img-top" alt="...">
                            <div class="card-body" id="enchantingExpert">
                            </div>
                        </div>
                        <div class="card container-fluid" style="width: 13rem;">
                            <img src="images/EngineeringLogo.JPG" class="card-img-top" alt="...">
                            <div class="card-body" id="engineeringExpert">
                            </div>
                        </div>
                        <div class="card container-fluid" style="width: 13rem;">
                            <img src="images/LWLogo.JPG" class="card-img-top" alt="...">
                            <div class="card-body" id="leatherworkExpert">
                            </div>
                        </div>
                        <div class="card container-fluid" style="width: 13rem;">
                            <img src="images/TailoringLogo.JPG" class="card-img-top" alt="...">
                            <div class="card-body" id="tailoringExpert">
                            </div>
                        </div>
                        <div class="card container-fluid" style="width: 13rem;">
                            <img src="images/HerbalismLogo.JPG" class="card-img-top" alt="...">
                            <div class="card-body" id="herbalismExpert">
                            </div>
                        </div>
                        <div class="card container-fluid" style="width: 13rem;">
                            <img src="images/MiningLogo.JPG" class="card-img-top" alt="...">
                            <div class="card-body" id="miningExpert">
                            </div>
                        </div>
                        <div class="card container-fluid" style="width: 13rem;">
                            <img src="images/SkinningLogo.JPG" class="card-img-top" alt="...">
                            <div class="card-body" id="skinningExpert">
                            </div>
                        </div>
                        <div class="card container-fluid" style="width: 13rem;">
                            <img src="images/CookingLogo.JPG" class="card-img-top" alt="...">
                            <div class="card-body" id="cookingExpert">
                            </div>
                        </div>



                    </div>
                </div>
            </div>

        </main>
        
        
    </body>
</html>
