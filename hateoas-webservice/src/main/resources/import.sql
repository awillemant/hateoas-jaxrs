INSERT INTO `Conference` (`id`,  `name`, `startDate`, `endDate`) VALUES (1, "Take Off Conf 2013", '2013-01-17 00:00:00', '2013-01-18 00:00:00');
INSERT INTO `Conference` (`id`,  `name`, `startDate`, `endDate`) VALUES (2, "Take Off Conf 2014", '2014-01-30 00:00:00', '2014-01-31 00:00:00');
INSERT INTO `Conference` (`id`,  `name`, `startDate`, `endDate`) VALUES (3, "Devoxx 2014", '2014-11-10 00:00:00', '2014-11-14 00:00:00');

INSERT INTO `Talk` (`id`,  `speakerName`, `title`, `conference_id`) VALUES (1, "Jakob Mattsson", "You are not service oriented enough!", 1);
INSERT INTO `Talk` (`id`,  `speakerName`, `title`, `conference_id`) VALUES (2, "Olivier Lacan", "Science-based development", 1);
INSERT INTO `Talk` (`id`,  `speakerName`, `title`, `conference_id`) VALUES (3, "Xavier Coulon", "Build your website with awestruct and publish it on the cloud with Git", 1);
INSERT INTO `Talk` (`id`,  `speakerName`, `title`, `conference_id`) VALUES (4, "Rémi Parmentier", "Design for developers", 1);

INSERT INTO `Talk` (`id`,  `speakerName`, `title`, `conference_id`) VALUES (5, "Luca Sale", "The bizarre app experiment", 2);
INSERT INTO `Talk` (`id`,  `speakerName`, `title`, `conference_id`) VALUES (6, "Paul Rouget", "Understanding a layout engine: parallelism and hardware acceleration", 2);
INSERT INTO `Talk` (`id`,  `speakerName`, `title`, `conference_id`) VALUES (7, "Ori Pekelman", "Zen and the art of Hypermedia design", 2);
INSERT INTO `Talk` (`id`,  `speakerName`, `title`, `conference_id`) VALUES (8, "Tim Ruffles", "Building a tiny AngularJS", 2);