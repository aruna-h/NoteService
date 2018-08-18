package com.bridgelabz.discoveryClient_note.repository;

import java.util.List;


import java.util.Optional;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.discoveryClient_note.model.Note;
/**
 * @author bridgelabz
 * @since 24/07/2018 <br>
 *        <p>
 *        Business Entity having the NoteElasticRepository related
 *        information.<br>
 *        </p>
 */
@Repository
public interface NoteElasticRepository extends ElasticsearchRepository<Note, String> {

	/**
	 * @param notedto
	 */
	public void save(Optional<Note> notedto);

	/**
	 * @param noteId
	 * @return
	 */
	public Optional<Note> getByNoteId(String noteId);

	/**
	 * @param userId
	 * @return
	 */
	public List<Note> findNotesByUserId(String userId);

}
