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

        <title>Template</title>
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
                    <h1 class="display-3">Sheepless Nights</h1>
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
                                    <li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
                                </ol>
                                <div class="carousel-inner">
                                    <div class="carousel-item active">
                                        <img src="background.jpg" class="d-block w-100" alt="...">
                                        <div class="carousel-caption d-none d-md-block">
                                            <h5>Welcome home!</h5>
                                            <p>The journey starts 27-08-2019..</p>
                                        </div>
                                    </div>
                                    <div class="carousel-item">
                                        <img src="https://proxy.duckduckgo.com/iu/?u=http%3A%2F%2Fgetwallpapers.com%2Fwallpaper%2Ffull%2F6%2Fe%2Fe%2F147388.jpg&f=1" class="d-block w-100" alt="...">
                                        <div class="carousel-caption d-none d-md-block">
                                            <h5>Short title</h5>
                                            <p>You will be able to copy paste a link from a picture and add it here with some text, like this.</p>
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
                            <h2>Short title</h2>
                            <p>You, as admin, will be able to create and delete small news sections, such as these listed
                                below. Idealy, you will also be able to edit both their title and their content, both directly
                                from the websites admin page. (The admin page has yet to be added)</p>
                        </div>
                        <div class="col-md-4">
                            <h2>Heading</h2>
                            <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo,
                                tortor
                                mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada
                                magna mollis euismod. Donec sed odio dui. </p>
                        </div>
                        <div class="col-md-4">
                            <h2>Heading</h2>
                            <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum
                                id
                                ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris
                                condimentum nibh, ut fermentum massa justo sit amet risus.</p>
                        </div>
                        <div class="col-md-4">
                            <h2>Heading</h2>
                            <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum
                                id
                                ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris
                                condimentum nibh, ut fermentum massa justo sit amet risus.</p>
                        </div>
                        <div class="col-md-4">
                            <h2>Heading</h2>
                            <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum
                                id
                                ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris
                                condimentum nibh, ut fermentum massa justo sit amet risus.</p>
                        </div>
                    </div>
                </div>
            </div>

            <div class="content" id="events">
                <div class="container">
                    <h1 class="sectionheadline"> Events </h1>
                    <div class="row">

                        <div class="card container-fluid" style="width: 18rem;">
                            <img src="shadowfangkeep.jpg" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">Card title</h5>
                                <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                            </div>
                            <ul class="list-group list-group-flush">
                                <li class="list-group-item">Inactive</li>
                            </ul>
                        </div>
                        <div class="card container-fluid" style="width: 18rem;">
                            <img src="shadowfangkeep.jpg" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">Card title</h5>
                                <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                            </div>
                            <ul class="list-group list-group-flush">
                                <li class="list-group-item">Inactive</li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>

            <div class="content" id="members">
                <div class="container">
                    <h1 class="sectionheadline"> Members </h1>
                    <div class="row">

                        <ul class="list-group">
                            <li class="list-group-item"><h1>Tanks</h1></li>
                            <li class="list-group-item list-group-item-secondary">A simple secondary list group item</li>
                            <li class="list-group-item list-group-item-secondary">A simple secondary list group item</li>
                            <li class="list-group-item list-group-item-secondary">A simple secondary list group item</li>
                            <li class="list-group-item list-group-item-secondary">A simple secondary list group item</li>
                            <li class="list-group-item list-group-item-secondary">A simple secondary list group item</li>
                            <li class="list-group-item list-group-item-secondary">A simple secondary list group item</li>
                        </ul>

                        <ul class="list-group">
                            <li class="list-group-item"><h1>Healers</h1></li>
                            <li class="list-group-item list-group-item-success">A simple success list group item</li>
                            <li class="list-group-item list-group-item-success">A simple success list group item</li>
                            <li class="list-group-item list-group-item-success">A simple success list group item</li>
                            <li class="list-group-item list-group-item-success">A simple success list group item</li>
                            <li class="list-group-item list-group-item-success">A simple success list group item</li>
                        </ul>
                        <ul class="list-group">
                            <li class="list-group-item"><h1>DPS</h1></li>
                            <li class="list-group-item list-group-item-danger">A simple success list group item</li>
                            <li class="list-group-item list-group-item-danger">A simple success list group item</li>
                            <li class="list-group-item list-group-item-danger">A simple success list group item</li>
                            <li class="list-group-item list-group-item-danger">A simple success list group item</li>
                            <li class="list-group-item list-group-item-danger">A simple success list group item</li>
                            <li class="list-group-item list-group-item-danger">A simple success list group item</li>
                            <li class="list-group-item list-group-item-danger">A simple success list group item</li>
                            <li class="list-group-item list-group-item-danger">A simple success list group item</li>
                            <li class="list-group-item list-group-item-danger">A simple success list group item</li>
                            <li class="list-group-item list-group-item-danger">A simple success list group item</li>
                        </ul>
                        <ul class="list-group">
                            <li class="list-group-item"><h1>Reserves</h1></li>
                            <li class="list-group-item list-group-item-primary">A simple success list group item</li>
                            <li class="list-group-item list-group-item-primary">A simple success list group item</li>
                            <li class="list-group-item list-group-item-primary">A simple success list group item</li>
                            <li class="list-group-item list-group-item-primary">A simple success list group item</li>
                            <li class="list-group-item list-group-item-primary">A simple success list group item</li>
                        </ul>

                    </div>
                </div>
            </div>
            
            <div class="content" id="professions">
                <div class="container">
                    <h1 class="sectionheadline"> Profession Experts </h1>
                    <div class="row">

                        <div class="card container-fluid" style="width: 13rem;">
                            <img src="AlchemyLogo.JPG" class="card-img-top" alt="alchemylogo">
                            <div class="card-body">
                                <h5 class="card-title">Alchemy</h5>
                                <p class="card-text">User1</p>
                                <p class="card-text">User2</p>
                            </div>
                        </div>
                        <div class="card container-fluid" style="width: 13rem;">
                            <img src="BlacksmithingLogo.JPG" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">Blacksmithing</h5>
                                <p class="card-text">User1</p>
                                <p class="card-text">User2</p>
                            </div>
                        </div>
                        <div class="card container-fluid" style="width: 13rem;">
                            <img src="EnchantingLogo.JPG" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">Enchanting</h5>
                                <p class="card-text">User1</p>
                                <p class="card-text">User2</p>
                            </div>
                        </div>
                        <div class="card container-fluid" style="width: 13rem;">
                            <img src="EngineeringLogo.JPG" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">Engineering</h5>
                                <p class="card-text">User1</p>
                                <p class="card-text">User2</p>
                            </div>
                        </div>
                        <div class="card container-fluid" style="width: 13rem;">
                            <img src="LWLogo.JPG" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">Leatherwork</h5>
                                <p class="card-text">User1</p>
                                <p class="card-text">User2</p>
                            </div>
                        </div>
                        
                        <div class="card container-fluid" style="width: 13rem;">
                            <img src="TailoringLogo.JPG" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">Tailoring</h5>
                                <p class="card-text">User1</p>
                                <p class="card-text">User2</p>
                            </div>
                        </div>
                        <div class="card container-fluid" style="width: 13rem;">
                            <img src="HerbalismLogo.JPG" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">Herbalism</h5>
                                <p class="card-text">User1</p>
                                <p class="card-text">User2</p>
                            </div>
                        </div>
                        <div class="card container-fluid" style="width: 13rem;">
                            <img src="MiningLogo.JPG" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">Mining</h5>
                                <p class="card-text">User1</p>
                                <p class="card-text">User2</p>
                            </div>
                        </div>
                        <div class="card container-fluid" style="width: 13rem;">
                            <img src="SkinningLogo.JPG" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">Skinning</h5>
                                <p class="card-text">User1</p>
                                <p class="card-text">User2</p>
                            </div>
                        </div>
                        <div class="card container-fluid" style="width: 13rem;">
                            <img src="CookingLogo.JPG" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">Cooking</h5>
                                <p class="card-text">User1</p>
                                <p class="card-text">User2</p>
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
    </body>

</html>