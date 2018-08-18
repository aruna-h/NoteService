package com.bridgelabz.discoveryClient_note.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.bridgelabz.discoveryClient_note.dto.LabelDto;
import com.bridgelabz.discoveryClient_note.model.Label;


/**
 * @author bridgelabz
 * @since 24/07/2018 <br>
 *        <p>
 *        Business Entity having the Label repository related information. <br>
 *        </p>
 */

public interface LabelRepository extends MongoRepository<Label, String> {
	/**
	 * @param label
	 */
	public void save(LabelDto label);

}
