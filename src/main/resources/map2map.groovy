import org.nomin.entity.*
import org.nomin.converter.*

def lower = new LowercaseConverter()

mappingFor a: Map, b: Map
a["name"] = b["firstName"];
//convert to_b: { lower.convert(it) } // Does not work...

//This works with map:
//a["gender"] = {if (b["male"] == true) Gender.MALE else Gender.FEMALE}
//b["male"] = {if (a["gender"] == Gender.MALE) true else false}

//None of this works with map:
a["gender"] = b["male"]
simple ([a: Gender.MALE, b: true], [a: Gender.FEMALE, b: false])
//convert to_b: { lower.convert(it) }


