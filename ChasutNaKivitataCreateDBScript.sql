-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema chasutnakivitata
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema chasutnakivitata
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `chasutnakivitata` DEFAULT CHARACTER SET utf8mb3 ;
USE `chasutnakivitata` ;

-- -----------------------------------------------------
-- Table `chasutnakivitata`.`register`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `chasutnakivitata`.`register` (
  `idRegister` INT NOT NULL AUTO_INCREMENT,
  `Fname` VARCHAR(45) NOT NULL,
  `Lname` VARCHAR(45) NOT NULL,
  `Email` VARCHAR(45) NOT NULL,
  `Password` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idRegister`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `chasutnakivitata`.`scores`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `chasutnakivitata`.`scores` (
  `idScores` INT NOT NULL AUTO_INCREMENT,
  `Score` INT NOT NULL,
  `Date` DATE NOT NULL,
  `idRegister` INT NOT NULL,
  PRIMARY KEY (`idScores`, `idRegister`),
  INDEX `fk_Scores_Register_idx` (`idRegister` ASC) VISIBLE,
  CONSTRAINT `fk_Scores_Register`
    FOREIGN KEY (`idRegister`)
    REFERENCES `chasutnakivitata`.`register` (`idRegister`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
