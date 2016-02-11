import org.nomin.entity.*

mappingFor a: Map, b: Map
a["name"] = b["firstName"];

//This works with map:
//a["gender"] = {if (b["male"] == true) Gender.MALE else Gender.FEMALE}
//b["male"] = {if (a["gender"] == Gender.MALE) true else false}

a["gender"] = b["male"]
simple ([a: Gender.MALE, b: true], [a: Gender.FEMALE, b: false]) // Does not work...

a["birthDate"] = b["birthStr"]
hint a: Date, b: String // Does not work...
dateFormat "dd-MM-yyyy" // Does not work...