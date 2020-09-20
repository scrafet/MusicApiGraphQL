package net.scrafet.musicApiGraphQL.resolver;

import org.springframework.beans.factory.annotation.Autowired;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import net.scrafet.musicApiGraphQL.entity.Album;
import net.scrafet.musicApiGraphQL.repository.AlbumsRepository;

public class Mutation implements GraphQLMutationResolver {

	private AlbumsRepository repoAlbums;
	
	@Autowired
	public Mutation(AlbumsRepository repoAlbums) {
		this.repoAlbums = repoAlbums;
	}
	
	public Album crearAlbum(String titulo, String lanzado,String genero,Double precio) {
		
	}
	
}
