package palaster.gj.libs;

public class LibMod {

    public static final String MODID = "gj",
	    NAME = "Get A Job",
	    VERSION = "@VERSION@",
	    DEPENDENCIES = "required-after:libpal",
	    GUI_FACTORY = "",
	    UPDATE_JSON = "https://raw.githubusercontent.com/palaster/Get-A-Job/HEAD/version/update.json",
	    CLIENT = "palaster.gj.core.proxy.ClientProxy",
	    SERVER = "palaster.gj.core.proxy.CommonProxy";
}