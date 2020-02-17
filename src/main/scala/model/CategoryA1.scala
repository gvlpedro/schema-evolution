package model

class CategoryA1(override val version: String,
                 override val ingestedBy: String,
                 override val description: String,
                 override val date: String)
    extends CategoryA(version, ingestedBy, description, date)
