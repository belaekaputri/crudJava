-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 21, 2024 at 06:41 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbkendaraan`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_kendaraan`
--

CREATE TABLE `tbl_kendaraan` (
  `noregis` varchar(255) NOT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `bahan` varchar(255) DEFAULT NULL,
  `kapasitas` int(11) NOT NULL,
  `merk` varchar(255) DEFAULT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `tahun` int(11) DEFAULT NULL,
  `warna` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_kendaraan`
--

INSERT INTO `tbl_kendaraan` (`noregis`, `alamat`, `bahan`, `kapasitas`, `merk`, `nama`, `tahun`, `warna`) VALUES
('B-1678-BDG', 'Polandia', 'Bensin', 150, 'Honda Vario', 'Cristiano Ronaldo', 2018, 'Hitam'),
('B-3110-BGT', 'Bengkulu', 'Bensin', 125, 'Honda Scoopy', 'Natasha Romanov', 2020, 'Hitam'),
('B-3461-UPQ', 'Jakarta', 'Bensin', 125, 'Honda Beat', 'Bambang Pamungkas', 2019, 'Biru'),
('B-7763-TXY', 'PARIS', 'Bensin', 150, 'Honda PCX', 'Lionel Messi', 2018, 'Merah'),
('B-7829-TYP', 'Bekasi', 'Bensin', 125, 'Honda Beat', 'Entis Siti Jubaidah', 2019, 'Merah');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_kendaraan`
--
ALTER TABLE `tbl_kendaraan`
  ADD PRIMARY KEY (`noregis`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
