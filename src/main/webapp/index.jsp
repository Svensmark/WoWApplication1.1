<!DOCTYPE html>
<html lang="en">

    <head>
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
        <title>Sheepless Nights</title>
    </head>


    <body>        
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
            <a class="navbar-brand" href="#">Sheepless Nights</a>
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
                        <a class="nav-link" href="/WoWApplication/Signup">Signup<span class="sr-only"></span></a>
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
                    <h1 class="sectionheadline"> Home </h1>
                    <div class="row">


                        <div class="bd-example">
                            <div id="carouselExampleCaptions" class="carousel slide" data-ride="carousel">
                                <ol class="carousel-indicators">
                                    <li data-target="#carouselExampleCaptions" data-slide-to="0" class="active"></li>
                                    <!--<li data-target="#carouselExampleCaptions" data-slide-to="1"></li>-->
                                </ol>
                                <div class="carousel-inner">
                                    <div class="carousel-item active">
                                        <img src="images/background.jpg" class="d-block w-100" alt="...">
                                        <div class="carousel-caption d-none d-md-block">
                                            <h5>Welcome home!</h5>
                                            <p>The journey has begun..</p>
                                        </div>
                                    </div>
                                </div>

                                <a class="carousel-control-prev" href="#carouselExampleCaptions" role="button" data-slide="prev">
                                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                                    <span class="sr-only">Previous</span>
                                </a>
                                <a class="carousel-control-next" href="#carouselExampleCaptions" role="button" data-slide="next">
                                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                                    <span class="sr-only">Next</span>
                                </a>
                            </div>
                        </div>


                    </div>
                </div>
            </div>

            <div class="content" id="news">
                <div class="container">
                    <h1 class="sectionheadline"> News </h1>
                    <div class="row">
                        <div class="col-md-4">
                            <h2>Website Online</h2>
                            <p>Poema and Liva are now happy to announce the working functionality of this website!
                                We will be using this as a guild tool to keep track of the members of the guild,
                                aswell of the calender including events and raid times etc. Stay tuned for more
                                information in the near future!</p>
                        </div>
                    </div>
                </div>
            </div>

            <div class="content" id="events">
                <div class="container">
                    <h1 class="sectionheadline"> Events </h1>
                    <div class="row">
                        <div class="card container-fluid" style="width: 18rem;">
                            <img src="https://wow.zamimg.com/uploads/screenshots/normal/81145-scarlet-monastery-scarlet-monastery-loading-screen.jpg" class="card-img-top">
                            <div class="card-body">
                                <h5 class="card-title">Dungeon Night</h5>
                                <p class="card-text">Scarlet Monastary - All</p>
                                <p class="card-text">8pm</p>
                            </div>
                            <ul class="list-group list-group-flush">
                                <li class="list-group-item">Active</li>
                            </ul>
                        </div>
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

        <div class="card text-center">
            <div class="card-header">
            </div>
            <div class="card-body">
                <h5 class="card-title">Don't have an account? Sign up!</h5>
                <a href="signup.jsp" class="btn btn-primary" style="background-color: #262626">Signup</a>
            </div>
        </div>

        <script type="text/javascript" src="mainScript.js"></script>

    </body>
</html>