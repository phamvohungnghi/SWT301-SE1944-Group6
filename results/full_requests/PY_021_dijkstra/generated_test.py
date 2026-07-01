import pytest

def test_dijkstra_valid_path():
    graph = [
        [0, 1, 4, 0, 0],
        [1, 0, 4, 2, 7],
        [4, 4, 0, 3, 5],
        [0, 2, 3, 0, 4],
        [0, 7, 5, 4, 0]
    ]
    assert dijkstra(graph, 0, 4) == 8  # Shortest path: 0 -> 1 -> 3 -> 4

def test_dijkstra_no_path():
    graph = [
        [0, 1, 0, 0],
        [1, 0, 0, 0],
        [0, 0, 0, 1],
        [0, 0, 1, 0]
    ]
    assert dijkstra(graph, 0, 3) == -1  # No path exists between 0 and 3

def test_dijkstra_same_source_and_destination():
    graph = [
        [0, 1, 4],
        [1, 0, 2],
        [4, 2, 0]
    ]
    assert dijkstra(graph, 1, 1) == 0  # Source and destination are the same

def test_dijkstra_disconnected_graph():
    graph = [
        [0, 0, 0],
        [0, 0, 0],
        [0, 0, 0]
    ]
    assert dijkstra(graph, 0, 2) == -1  # Completely disconnected graph

def test_dijkstra_negative_weights():
    graph = [
        [0, -1, 4],
        [-1, 0, 2],
        [4, 2, 0]
    ]
    assert dijkstra(graph, 0, 2) == 4  # Ignores negative weights as per the logic

def test_dijkstra_invalid_source():
    graph = [
        [0, 1, 4],
        [1, 0, 2],
        [4, 2, 0]
    ]
    with pytest.raises(IndexError):
        dijkstra(graph, -1, 2)  # Invalid source index

def test_dijkstra_invalid_destination():
    graph = [
        [0, 1, 4],
        [1, 0, 2],
        [4, 2, 0]
    ]
    with pytest.raises(IndexError):
        dijkstra(graph, 0, 3)  # Invalid destination index

def test_dijkstra_empty_graph():
    graph = []
    assert dijkstra(graph, 0, 0) == -1  # Empty graph, no nodes

def test_dijkstra_none_graph():
    graph = None
    assert dijkstra(graph, 0, 0) == -1  # Graph is None

def test_dijkstra_single_node_graph():
    graph = [[0]]
    assert dijkstra(graph, 0, 0) == 0  # Single node, source and destination are the same

def test_dijkstra_large_graph():
    graph = [
        [0, 10, 0, 0, 0, 0, 0, 0, 0, 0],
        [10, 0, 5, 0, 0, 0, 0, 0, 0, 0],
        [0, 5, 0, 20, 0, 0, 0, 0, 0, 0],
        [0, 0, 20, 0, 1, 0, 0, 0, 0, 0],
        [0, 0, 0, 1, 0, 2, 0, 0, 0, 0],
        [0, 0, 0, 0, 2, 0, 3, 0, 0, 0],
        [0, 0, 0, 0, 0, 3, 0, 4, 0, 0],
        [0, 0, 0, 0, 0, 0, 4, 0, 5, 0],
        [0, 0, 0, 0, 0, 0, 0, 5, 0, 6],
        [0, 0, 0, 0, 0, 0, 0, 0, 6, 0]
    ]
    assert dijkstra(graph, 0, 9) == 26  # Shortest path: 0 -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9