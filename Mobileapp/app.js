var routerApp = angular.module('myApp', ['ui.router','ngMaterial']);

routerApp.config(function($stateProvider,$urlRouterProvider)

{

    $stateProvider
        .state('login', {
            url: '/login',
            templateUrl: 'Templates/login.html',
            controller :'logincontroller'
        })


       .state('home', {
          url:'/home',
          templateUrl :'Templates/home.html',
          controller :'homeController'

        })

        .state('home.Dashboard',{
         url:'/Dashboard',
         templateUrl:'Templates/Dashboard.html',
         controller :'dashboardController',
    });

  $urlRouterProvider.otherwise('/login');
});
