CREATE TABLE `prices` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(30) NOT NULL,
  `price` decimal(10,2) NOT NULL,
  `show_id` int(11) DEFAULT NULL,
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Index pour la table `prices`
--
ALTER TABLE `prices`
  ADD KEY `prices_show_id` (`show_id`);

--
-- Contraintes pour la table `prices`
--
ALTER TABLE `prices`
  ADD CONSTRAINT `prices_show_id` FOREIGN KEY (`show_id`) REFERENCES `shows` (`id`) ON UPDATE CASCADE ON DELETE RESTRICT;
