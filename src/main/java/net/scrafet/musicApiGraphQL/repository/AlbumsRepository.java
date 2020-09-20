package net.scrafet.musicApiGraphQL.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.scrafet.musicApiGraphQL.entity.Album;

public interface AlbumsRepository extends JpaRepository<Album, Integer> {

}
