-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema restaurant_sys_mng
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema restaurant_sys_mng
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `restaurant_sys_mng` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `restaurant_sys_mng` ;

-- -----------------------------------------------------
-- Table `restaurant_sys_mng`.`drink`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `restaurant_sys_mng`.`drink` ;

CREATE TABLE IF NOT EXISTS `restaurant_sys_mng`.`drink` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `code_id` VARCHAR(45) NOT NULL,
  `desctiption` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 6
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `restaurant_sys_mng`.`menu`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `restaurant_sys_mng`.`menu` ;

CREATE TABLE IF NOT EXISTS `restaurant_sys_mng`.`menu` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `description` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 12
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `restaurant_sys_mng`.`menutype`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `restaurant_sys_mng`.`menutype` ;

CREATE TABLE IF NOT EXISTS `restaurant_sys_mng`.`menutype` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `type` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `restaurant_sys_mng`.`bills`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `restaurant_sys_mng`.`bills` ;

CREATE TABLE IF NOT EXISTS `restaurant_sys_mng`.`bills` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `bill_no` INT NOT NULL,
  `drink_id` INT NULL DEFAULT NULL,
  `menu_id` INT NULL DEFAULT NULL,
  `menutype_id` INT NULL,
  `unitePrice` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_bills_drink1`
    FOREIGN KEY (`drink_id`)
    REFERENCES `restaurant_sys_mng`.`drink` (`id`),
  CONSTRAINT `fk_fatura_menu1`
    FOREIGN KEY (`menu_id`)
    REFERENCES `restaurant_sys_mng`.`menu` (`id`),
  CONSTRAINT `fk_bills_menutype1`
    FOREIGN KEY (`menutype_id`)
    REFERENCES `restaurant_sys_mng`.`menutype` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

CREATE INDEX `fk_fatura_menu1_idx` ON `restaurant_sys_mng`.`bills` (`menu_id` ASC) VISIBLE;

CREATE INDEX `fk_bills_drink1_idx` ON `restaurant_sys_mng`.`bills` (`drink_id` ASC) VISIBLE;

CREATE INDEX `fk_bills_menutype1_idx` ON `restaurant_sys_mng`.`bills` (`menutype_id` ASC) VISIBLE;


-- -----------------------------------------------------
-- Table `restaurant_sys_mng`.`profession`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `restaurant_sys_mng`.`profession` ;

CREATE TABLE IF NOT EXISTS `restaurant_sys_mng`.`profession` (
  `id` INT NOT NULL,
  `profession_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `restaurant_sys_mng`.`employee`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `restaurant_sys_mng`.`employee` ;

CREATE TABLE IF NOT EXISTS `restaurant_sys_mng`.`employee` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `surname` VARCHAR(45) NOT NULL,
  `address` VARCHAR(45) NOT NULL,
  `profession_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_employee_profession1`
    FOREIGN KEY (`profession_id`)
    REFERENCES `restaurant_sys_mng`.`profession` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

CREATE INDEX `fk_employee_profession1_idx` ON `restaurant_sys_mng`.`employee` (`profession_id` ASC) VISIBLE;


-- -----------------------------------------------------
-- Table `restaurant_sys_mng`.`orari`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `restaurant_sys_mng`.`orari` ;

CREATE TABLE IF NOT EXISTS `restaurant_sys_mng`.`orari` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `turni` VARCHAR(45) NOT NULL,
  `employee_id` INT NOT NULL,
  `by_hour` TIME NOT NULL,
  `until_hour` TIME NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_orari_employee1`
    FOREIGN KEY (`employee_id`)
    REFERENCES `restaurant_sys_mng`.`employee` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

CREATE INDEX `fk_orari_employee1_idx` ON `restaurant_sys_mng`.`orari` (`employee_id` ASC) VISIBLE;


-- -----------------------------------------------------
-- Table `restaurant_sys_mng`.`total_bills`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `restaurant_sys_mng`.`total_bills` ;

CREATE TABLE IF NOT EXISTS `restaurant_sys_mng`.`total_bills` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `employee_id` INT NOT NULL,
  `bills_id` INT NOT NULL,
  `total_price` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_total_bills_bills1`
    FOREIGN KEY (`bills_id`)
    REFERENCES `restaurant_sys_mng`.`bills` (`id`),
  CONSTRAINT `fk_total_bills_employee1`
    FOREIGN KEY (`employee_id`)
    REFERENCES `restaurant_sys_mng`.`employee` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

CREATE INDEX `fk_total_bills_employee1_idx` ON `restaurant_sys_mng`.`total_bills` (`employee_id` ASC) VISIBLE;

CREATE INDEX `fk_total_bills_bills1_idx` ON `restaurant_sys_mng`.`total_bills` (`bills_id` ASC) VISIBLE;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
