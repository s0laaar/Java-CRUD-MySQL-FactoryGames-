-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-11-2020 a las 23:13:47
-- Versión del servidor: 10.4.16-MariaDB
-- Versión de PHP: 7.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `juegos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `juego`
--

CREATE TABLE `juego` (
  `nombre_juego` varchar(50) NOT NULL,
  `plataforma_juego` varchar(20) NOT NULL,
  `precio_juego` int(5) NOT NULL,
  `estado_juego` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `juego`
--

INSERT INTO `juego` (`nombre_juego`, `plataforma_juego`, `precio_juego`, `estado_juego`) VALUES
('Crash Bandicoot', 'PS4', 29990, 1),
('Fortnite', 'PS4', 9990, 1),
('Mario 64', 'Nintendo 64', 15990, 1),
('Metro Exodus', 'PC', 39990, 0),
('Pac-Man 3D World', 'PS3', 16990, 0),
('Rocket League', 'XBOX One', 5990, 1),
('Spider Man: Miles-Morales', 'PS5', 49990, 1),
('The Legend of Zelda: Breath of The Wild', 'Nintendo Switch', 49990, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `juego`
--
ALTER TABLE `juego`
  ADD PRIMARY KEY (`nombre_juego`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
