package net.scrafet.musicApiGraphQL.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import net.scrafet.musicApiGraphQL.entity.Album;
import net.scrafet.musicApiGraphQL.repository.AlbumsRepository;

@Component
public class Query implements GraphQLQueryResolver {
	
	
	private AlbumsRepository repoAlbums;
	
	
	@Autowired
	public Query(AlbumsRepository repoAlbums) {
		this.repoAlbums = repoAlbums;
	}
	
	public Iterable<Album> buscarTodos(){
		return repoAlbums.findAll();
	}
	
	public Long contarTodos() {
		return repoAlbums.count();
	}

}
