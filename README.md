# Autoaim Game Solver

![GitHub license](https://img.shields.io/badge/license-MIT-blue.svg)

## Table of Contents

- [Problem Description](#problem-description)
- [Solution Algorithm](#solution-algorithm)
- [Input Data](#input-data)
- [Output Data](#output-data)
- [Usage](#usage)
- [License](#license)
- [Author](#author)

## Problem Description

The Autoaim Game presents a gaming scenario where Player1 is equipped with autoaim technology to take down enemies on a grid-based battlefield. This challenge reflects the concept of autoaim in video games, making the gameplay accessible and enjoyable for all players.

- The battlefield is a grid with rows (R) and columns (C).
- Player1 starts in row 0, and enemies are distributed throughout the field.
- Each round, Player1 has a limited number of shots to eliminate enemies.
- The damage inflicted on enemies is calculated based on distance, D - F * H.
- The goal is to determine the number of shots (rounds) required to clear the field of all enemies.

## Solution Algorithm

The solution algorithm is designed to find the optimal number of rounds required to defeat all enemies while considering distance-based damage calculations.

- For each test case, the algorithm calculates the minimum number of rounds needed.
- It takes into account the distance between Player1 and enemies.
- The goal is to maximize efficiency in eliminating enemies.

## Input Data

- The input file contains test cases, each including:
  - Field dimensions: R (number of rows), C (number of columns).
  - Enemy information: N (number of enemies), S (shots per round), D (base damage), and H (damage reduction).
  - Coordinates (X, Y) of each enemy on the grid.

## Output Data

- The output file provides the number of rounds (shots) required to clear the field for each test case.

## Usage

1. Clone the repository to your local machine.
2. Create an input file (e.g., `input.txt`) with test cases in the specified format.
3. Execute the Java program (e.g., `Main.java`) to find the optimal number of rounds.
4. The program generates an output file (e.g., `output.txt`) with the results.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Author

- Aaryan Paiva

Enjoy playing the Autoaim Game and defeating all your enemies!
