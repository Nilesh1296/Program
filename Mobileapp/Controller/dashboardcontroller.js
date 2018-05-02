routerApp.controller('dashboardController',function( $scope ,$mdDialog)
{
  $scope.showAdvanced = function(event,data) {
   $mdDialog.show({
      locals: { item: data },
     controller: DialogController,
     templateUrl: 'Templates/Dialog.html',
     parent: angular.element(document.body),
     targetEvent: event,
     clickOutsideToClose:true

   });
};
function DialogController($scope, $mdDialog,item) {
  $scope.data=item;
  console.log(item);
    $scope.hide = function() {
      $mdDialog.hide();
    }
};
});
