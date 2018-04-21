routerApp.controller("logincontroller",function( $scope,$state )
{
  $scope.submit = function()
  {
    var user=$scope.username;
    var pass=$scope.Password;
    if(user!=''&&pass!='')
    {
    $state.go('home');
    }

    };
});
