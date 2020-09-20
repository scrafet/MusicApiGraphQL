package net.scrafet.musicApiGraphQL.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.scrafet.musicApiGraphQL.entity.Album;
import net.scrafet.musicApiGraphQL.repository.AlbumsRepository;
import net.scrafet.musicApiGraphQL.service.IAlbumsService;

@Service
public class AlbumsService implements IAlbumsService {
	
	@Autowired
	AlbumsRepository repoAlbums;

	@Override
	public List<Album> buscarTodo() {		
		return repoAlbums.findAll();
	}

}
