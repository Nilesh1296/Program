routerApp.controller("logincontroller",function( $scope,$state )
{

  $scope.username = "";
    $scope.Password = "";


  $scope.submit = function(){

    state.go('home');


    };
});
