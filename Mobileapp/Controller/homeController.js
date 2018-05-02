  routerApp.controller('homeController',  function($scope,$state, $mdSidenav,Jsonservice) {

  //     $scope.toggleLeft = buildToggler('left');
  //
  // function buildToggler(componentId) {
  //   return function() {
  //     $mdSidenav(componentId).toggle();
  //   };
  // }
  $scope.toggleSidenav = buildToggler('closeEventsDisabled');
  $scope.toggleLeft = buildToggler('left');

    function buildToggler(componentId) {
      return function() {
        $mdSidenav(componentId).toggle();
      };
    }
  var selectedManufactur =[];
  var selectedStorage = [];
  var selectedOS = [];
  var selectedCamera = [];

   $scope.readJson = Jsonservice.read();
   $scope.readJson.then(function(response){
    $scope.JsonRecord = response.data
 });
 $state.go('home.Dashboard');
 $scope.toggle=function(selectOption, selectedItem) {
 switch(selectOption)
 {
   case 'manufacturer':
   var manufactureindex=selectedManufactur.indexOf(selectedItem);
       if (manufactureindex > -1)
       {
   selectedManufactur.splice(manufactureindex, 1);
       }
       else
       {
         selectedManufactur.push(selectedItem);
       }
       break;
   case 'storage':
       var storageindex=selectedStorage.indexOf(selectedItem);
           if (storageindex > -1) {
             selectedStorage.splice(storageindex, 1);
           }
           else {
             selectedStorage.push(selectedItem);
           }
           break;
  case 'OS':
           var osindex=selectedOS.indexOf(selectedItem);
               if (osindex > -1) {
                 selectedOS.splice(osindex, 1);
               }
               else {
                 selectedOS.push(selectedItem);
               }

               break;
 case 'camera':
               var cameraindex=selectedCamera.indexOf(selectedItem);
                   if (cameraindex > -1) {
                     selectedCamera.splice(cameraindex, 1);
                   }
                   else {
                     selectedCamera.push(selectedItem);
                   }
                   break;
}
};

$scope.manufacturearray=selectedManufactur;
$scope.storagearray=selectedStorage;
$scope.osarray=selectedOS;
$scope.cameraarray=selectedCamera;
});

routerApp.filter('customFilter',function()
{
  return function(itemss,manufacturearray,storagearray,osarray,cameraarray){
    var filtered=[];
    var temarray=[];
 if(itemss!=undefined)
 {
  if(manufacturearray !=undefined ||storagearray !=undefined || osarray !=undefined ||cameraarray !=undefined)
   {
     console.log(manufacturearray)
     for(var j=0;j<itemss.length;j++)
     {
       var item=itemss[j];
       for(var i=0;i<manufacturearray.length;i++)
       {
         var selectedItem=manufacturearray[i];
         if(item.specs.manufacturer==selectedItem)
           {
             filtered.push(item);
           }
        }
      }
      if(filtered.length>0)
      {
        temarray=filtered;
        filtered=[];
      }else
      {
       temarray=itemss;
      }
      if(storagearray.length>0)
      {
        for(var j=0;j<temarray.length;j++)
        {
          var item=temarray[j];
          for(var i=0;i<storagearray.length;i++)
          {
            var selectedItem=storagearray[i];
            if(item.specs.storage==selectedItem)
              {
                filtered.push(item);
              }
           }
        }
          temarray=filtered;
          filtered=[];
      }

        if(osarray.length>0)
        {
          for(var j=0;j<temarray.length;j++)
          {
            var item=temarray[j];
            for(var i=0;i<osarray.length;i++)
            {
              var selectedItem=osarray[i];
              if(item.specs.os==selectedItem)
                {
                  filtered.push(item);
                }
            }
          }
            temarray=filtered;
            filtered=[];
          }

            if(cameraarray.length>0)
            {
              for(var j=0;j<temarray.length;j++)
              {
                var item=temarray[j];
                for(var i=0;i<cameraarray.length;i++)
                {
                  var selectedItem=cameraarray[i];
                  if(item.specs.camera==selectedItem)
                    {
                      filtered.push(item);
                    }
                }
              }
                temarray=filtered;
                filtered=[];
              }
        }
else {
    temarray=itemss;
    }
  }
return temarray;
};
});
