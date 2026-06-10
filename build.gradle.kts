plugins {
  id("me.roundaround.allay")
}

allay {
  displayName.set("Experience Progress")
  description.set("Show current experience level and amount needed to level up as numbers over the XP bar.")
  authors.set(listOf("Roundaround"))
  license.set("MIT")
  homepage.set("https://modrinth.com/mod/experience-progress")
  repository.set("https://github.com/Roundaround/mc-experience-progress")
  issues.set("https://github.com/Roundaround/mc-experience-progress/issues")
  logoFile.set("assets/experienceprogress/banner.png")

  modrinth {
    projectId.set("experience-progress")
  }

  curseforge {
    projectId.set(1502612)
  }

  release {
    versionType.set("release")
    sourcesJar.set(true)
  }
}
