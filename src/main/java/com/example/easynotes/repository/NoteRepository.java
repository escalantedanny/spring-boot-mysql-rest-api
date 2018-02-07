/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.easynotes.repository;

import com.example.easynotes.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author danny
 */
public interface NoteRepository extends JpaRepository<Note, Long>
{
    
}
