package net.scrafet.musicApiGraphQL.service;

import java.util.List;

import net.scrafet.musicApiGraphQL.entity.Album;

public interface IAlbumsService {

	List<Album> buscarTodo();
}
