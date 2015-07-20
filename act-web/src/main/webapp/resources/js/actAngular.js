/**
 * Angular file
 */
var module = angular.module('act-app', ['ui.router', 'ngDialog', 'pascalprecht.translate', 'ui.bootstrap', 'angular-table']);

//STATE ROUTES
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
					templateUrl : '../resources/pages/home.jsp',
						controller : 'homeController'
				}
			}
		}
	)
	.state('dboard.server',
		{
			url: "",
			views: {
				'content@' : {
					templateUrl : '../resources/pages/servers.jsp',
					controller : 'serverController'
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
  	);
	$urlRouterProvider.otherwise("");
});

//DIRECTIVES



//CONTROLLERS
module.controller("userInfoController", function ($scope, $state) {
	$scope.userInfoDetails = {
	    templateUrl: 'userInformation',
	};
});

module.controller("menuController", function ($scope, $state) {
	$scope.home = function() {
        $state.go('dboard');
	};
	$scope.server = function() {
        $state.go('dboard.server');
	};
});

module.controller("homeController", function ($scope, $state) {
});

module.controller("serverController", function ($scope, $state) {
	
	$.ajax({
        url: '/act-web/actServer/getAllServers.do',
        type: 'GET',
        dataType: 'json',
        async: false,
        success: function(data) {
            $scope.serverList = data;
            $scope.config = {
	    	    itemsPerPage: 3,
	    	    fillLastPage: true
            }
        }
    }).fail(function() {
    	$scope.loading = false;
    });
});
	  