SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

CREATE SCHEMA IF NOT EXISTS `ChasutNaKivitata` DEFAULT CHARACTER SET utf8 ;
USE `ChasutNaKivitata` ;

-- -----------------------------------------------------
-- Table `mydb`.`Register`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ChasutNaKivitata`.`Register` (
  `idRegister` INT NOT NULL,
  `Fname` VARCHAR(45) NOT NULL,  
  `Lname` VARCHAR(45) NOT NULL,
  `Email` VARCHAR(45) NOT NULL,
  `Password` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idRegister`),
  UNIQUE INDEX `Email_UNIQUE` (`Email` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Scores`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ChasutNaKivitata`.`Scores` (
  `idScores` INT NOT NULL,
  `Score` INT NOT NULL,
  `Date` DATE NOT NULL,
  `idRegister` INT NOT NULL,
  PRIMARY KEY (`idScores`, `idRegister`),
  INDEX `fk_Scores_Register_idx` (`idRegister` ASC),
  CONSTRAINT `fk_Scores_Register`
    FOREIGN KEY (`idRegister`)
    REFERENCES `ChasutNaKivitata`.`Register` (`idRegister`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
