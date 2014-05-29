define([ 'modules/hateoasModule',  'resources/Conference' ], function(hateoasModule) {

	hateoasModule.controller('ConferenceController', function($scope,  $log, Conference) {

		$scope.conferences = [];

		var refreshConferences = function() {
			$log.debug("Rafraichissement de la liste des conferences");
			$scope.futureConferences = Conference.query().$promise;
			$scope.futureConferences.then(function(data) {
				
				$scope.conferences = data;
				$log.debug($scope.conferences);
			});
		};
		

		refreshConferences();

	});

});