/**
 * 
 */
package org.openmrs.module.mohbilling.model;

/**
 * @author EMR@RBC
 *
 */
public enum Category {

	CHIRURGIE ("CHIRURGIE"),CONSOMMABLES("CONSOMMABLES"),
	CONSULTATION ("CONSULTATION"),
	DERMATOLOGIE ("DERMATOLOGIE"),
	ECHOGRAPHIE ("ECHOGRAPHIE"),
	FORMALITES_ADMINISTRATIVES ("FORMALITES ADMINISTRATIVES"),
	HOSPITALISATION ("HOSPITALISATION"),
	KINESITHERAPIE ("KINESITHERAPIE"),LABORATOIRE ("LABORATOIRE"),
	MATERNITE ("MATERNITE"),MEDECINE_INTERNE ("MEDECINE INTERNE"),
	MEDICAMENTS ("MEDICAMENTS"),OPHTALMOLOGIE ("OPHTALMOLOGIE"),
	ORL ("ORL"),OXYGENOTHERAPIE ("OXYGENOTHERAPIE"),PEDIATRIE ("PEDIATRIE"),
	RADIOLOGIE ("RADIOLOGIE"),SOINS_INFIRMIERS ("SOINS INFIRMIERS"),
	SOINS_INTENSIFS ("SOINS INTENSIFS"),STOMATOLOGIE ("STOMATOLOGIE"),
	NEUROLOGIE("NEUROLOGIE"),AUTRES("AUTRES"),AMBULANCE("AMBULANCE");
	
	
	private final String description;
	
	private Category(String name) {
		this.description = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return this.description;
	}
}
