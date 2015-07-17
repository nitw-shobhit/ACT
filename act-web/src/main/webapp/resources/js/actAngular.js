/**
 * Angular file
 */
var module = angular.module('act-app', ['ui.router', 'ngDialog', 'pascalprecht.translate', 'ui.bootstrap']);

module.config(function ($stateProvider, $urlRouterProvider, $provide) {
	$stateProvider.state('dboard',
		{
			url: "",
			views: {
				'menu' : {
					templateUrl : '../resources/pages/dashboard/menu.jsp',
					controller : 'menuController'
				},
				'content' : {
					templateUrl : '../resources/pages/home.jsp'
				}
			}
		}
	)
	.state('dboard.server',
		{
			url: "",
			views: {
				'content@' : {
					templateUrl : '../resources/pages/servers.jsp'
				}
			}
		}
  	)
  	.state('dboard.databases',
		{
			url: "",
			views: {
				'content@' : {
					templateUrl : '../resources/pages/databases.jsp'
				}
			}
		}
  	)
  	.state('dboard.settings',
		{
			url: "",
			views: {
				'content@' : {
					templateUrl : '../resources/pages/settings.jsp'
				}
			}
		}
  	)
	.state('dboard.help',
		{
			url: "",
			views: {
				'content@' : {
					templateUrl : '../resources/pages/help.jsp'
				}
			}
		}
  	)
	$urlRouterProvider.otherwise("");
});

module.controller("userInfoController", function ($scope, $state) {
	$scope.userInfoDetails = {
	    templateUrl: 'userInformation',
	};
});

module.controller("menuController", function ($scope, $state) {
	$scope.clickme = function() {
        $state.go('dboard.test');
	}
});
	  