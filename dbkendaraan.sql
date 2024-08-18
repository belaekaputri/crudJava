-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 09, 2024 at 03:34 AM
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
  `id` bigint(20) NOT NULL,
  `noregis` varchar(10) NOT NULL,
  `tahun` int(11) NOT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `bahan` varchar(255) DEFAULT NULL,
  `kapasitas` int(11) NOT NULL,
  `merk` varchar(255) DEFAULT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `warna` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_kendaraan`
--

INSERT INTO `tbl_kendaraan` (`id`, `noregis`, `tahun`, `alamat`, `bahan`, `kapasitas`, `merk`, `nama`, `warna`) VALUES
(1, 'B-1678-BDG', 2018, 'Polandia', 'Bensin', 150, 'Honda Vario', 'Cristiano Ronaldo', 'Hitam'),
(2, 'B-3110-BGT', 2020, 'Bengkulu', 'Bensin', 125, 'Honda Scoopy', 'Natasha Romanov', 'Merah'),
(3, 'B-3461-UPQ', 2019, 'Jakarta', 'Bensin', 125, 'Honda Beat', 'Bambang Pamungkas', 'Biru'),
(4, 'B-7763-TXY', 2018, 'PARIS', 'Bensin', 150, 'Honda PCX', 'Lionel Messi', 'Hitam'),
(5, 'B-7829-TYP', 2019, 'Bekasi', 'Bensin', 125, 'Honda Beat', 'Entis Siti Jubaidah', 'Merah');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_kendaraan`
--
ALTER TABLE `tbl_kendaraan`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_vd5cle1dneqwdcvyjdautjst` (`noregis`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_kendaraan`
--
ALTER TABLE `tbl_kendaraan`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
