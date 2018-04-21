  routerApp.controller('homeController',  function($scope, $mdSidenav,Jsonservice) {

      $scope.toggleLeft = buildToggler('left');
  $scope.toggleRight = buildToggler('right');

  function buildToggler(componentId) {
    return function() {
      $mdSidenav(componentId).toggle();
    };
  }
   $scope.readJson = Jsonservice.read();
   $scope.readJson.then(function(response){
    $scope.JsonRecord = response.data;

 });
})
