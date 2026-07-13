import pytest

def test_dijkstra_none_graph():
    assert dijkstra(None, 0, 1) == -1

def test_dijkstra_empty_graph():
    assert dijkstra([], 0, 1) == -1

def test_dijkstra_single_node():
    graph = [[0]]
    assert dijkstra(graph, 0, 0) == 0
    assert dijkstra(graph, 0, 1) == -1

def test_dijkstra_two_nodes_no_edge():
    graph = [[0, 0], [0, 0]]
    assert dijkstra(graph, 0, 1) == -1

def test_dijkstra_two_nodes_with_edge():
    graph = [[0, 1], [0, 0]]
    assert dijkstra(graph, 0, 1) == 1

def test_dijkstra_three_nodes():
    graph = [[0, 1, 4], [0, 0, 2], [0, 0, 0]]
    assert dijkstra(graph, 0, 2) == 3
    assert dijkstra(graph, 1, 2) == 2
    assert dijkstra(graph, 0, 1) == 1

def test_dijkstra_disconnected_graph():
    graph = [[0, 0, 0], [0, 0, 0], [0, 0, 0]]
    assert dijkstra(graph, 0, 2) == -1

def test_dijkstra_multiple_paths():
    graph = [[0, 10, 5], [0, 0, 2], [0, 3, 0]]
    assert dijkstra(graph, 0, 1) == 8
    assert dijkstra(graph, 0, 2) == 5

def test_dijkstra_path_with_zero_weight():
    graph = [[0, 0, 1], [0, 0, 0], [0, 0, 0]]
    assert dijkstra(graph, 0, 2) == 1

def test_dijkstra_large_graph():
    graph = [[0, 1, 2, 0, 0], [0, 0, 0, 1, 0], [0, 0, 0, 0, 3], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]]
    assert dijkstra(graph, 0, 4) == 5

def test_dijkstra_no_path():
    graph = [[0, 1, 0], [0, 0, 1], [0, 0, 0]]
    assert dijkstra(graph, 0, 2) == 2
    assert dijkstra(graph, 1, 0) == -1

def test_dijkstra_same_source_dest():
    graph = [[0, 1], [1, 0]]
    assert dijkstra(graph, 0, 0) == 0
    assert dijkstra(graph, 1, 1) == 0