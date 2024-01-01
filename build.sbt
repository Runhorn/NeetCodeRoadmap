name := "NeetCode"

version := "0.1"

scalaVersion := "2.13.12"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.17" % "test"
libraryDependencies += "org.scalatest" %% "scalatest-wordspec" % "3.2.17" % "test"

coverageFailOnMinimum := true
coverageMinimumStmtTotal := 90
coverageMinimumBranchTotal := 90
coverageMinimumStmtPerPackage := 90
coverageMinimumBranchPerPackage := 85
coverageMinimumStmtPerFile := 85
coverageMinimumBranchPerFile := 80
