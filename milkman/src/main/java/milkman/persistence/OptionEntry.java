package milkman.persistence;

import org.dizitart.no2.objects.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import milkman.ui.plugin.OptionsObject;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OptionEntry {

	@Id
	long id;
	String optionProviderClass;
	OptionsObject optionsObject;
}
