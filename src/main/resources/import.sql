INSERT INTO `Conference` (`id`, `creation_time`, `modification_time`, `endDate`, `name`, `startDate`) VALUES (1, '2014-04-26 00:00:00', '2014-04-26 00:00:00', '2014-04-26 00:00:00', 'TakeOff Talks', '2014-04-26 00:00:00'),(2, '2014-04-26 00:00:00', '2014-04-26 00:00:00', '2014-04-26 00:00:00', 'TakeOff Conf', '2014-04-26 00:00:00');



INSERT INTO `Talk` (`id`, `creation_time`, `modification_time`, `speakerName`, `title`, `conference_id`) VALUES (5, '2014-04-26 00:00:00', '2014-04-26 00:00:00', 'awillemant', 'Hypermedia FTW', 1),(6, '2014-04-26 00:00:00', '2014-04-26 00:00:00', 'XVW', 'Le fantasme du jeu sans fin', 1),(7, '2014-04-26 00:00:00', '2014-04-26 00:00:00', 'awillemant', 'Test', 1);