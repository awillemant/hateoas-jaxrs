define([ 'modules/hateoasModule',  'resources/Conference' ], function(hateoasModule) {

	hateoasModule.controller('ConferenceController', function($scope,  $log, Conference, LinkUtils) {

		$scope.conferences = [];

		var refreshConferences = function() {
			$log.debug("Rafraichissement de la liste des conferences");
			var futureConferences = Conference.query().$promise;
			futureConferences.then(function(data) {
				
				$scope.conferences = data;
				$log.debug($scope.conferences);
			});
		};
		

		refreshConferences();
		
		
		$scope.canSubscribe = function(conference){
			//return new Date()<new Date(conference.endDate);
			return LinkUtils.getIndexForRel(conference,"subscribe") != -1;
		};
		

	});

});